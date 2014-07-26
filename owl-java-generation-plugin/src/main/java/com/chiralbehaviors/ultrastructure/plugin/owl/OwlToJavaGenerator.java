/**
 * (C) Copyright 2012 Chiral Behaviors, LLC. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chiralbehaviors.ultrastructure.plugin.owl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.protege.owl.codegeneration.main.GenerateSimpleJavaCode;

/**
 * @author hhildebrand
 *
 */
/*
 * Copyright (c) 2009, 2011 Hal Hildebrand, all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author hhildebrand
 *
 * @goal generate
 *
 * @phase process-resources
 */
public class OwlToJavaGenerator extends AbstractMojo {

    public static final File DEFAULT_OUTPUT_DIRECTORY = new File(
                                                                 "target/generated-sources/owl");

    /**
     * delete the output directory before starting
     *
     * @parameter
     */
    private boolean          deleteDirectory          = true;

    /**
     * name of factory
     *
     * @parameter
     */
    private String           factoryName;
    /**
     * the ontology to generate a Java class model
     * @parameter
     */
    private File             ontology;
    /**
     * output directory
     *
     * @parameter
     */
    private File             outputDirectory          = DEFAULT_OUTPUT_DIRECTORY;
    /**
     * package for generated code
     *
     * @parameter
     */
    private String           packageName;
    /**
     * reasoner to use to generate code
     *
     * @parameter
     */
    private String           reasoner;

    public OwlToJavaGenerator() {
    }

    public OwlToJavaGenerator(boolean deleteDirectory, String factoryName,
                              File outputDirectory, String packageName,
                              String reasoner, File ontology) {
        this.deleteDirectory = deleteDirectory;
        this.factoryName = factoryName;
        this.outputDirectory = outputDirectory;
        this.packageName = packageName;
        this.reasoner = reasoner;
        this.ontology = ontology;
    }

    /* (non-Javadoc)
     * @see org.apache.maven.plugin.Mojo#execute()
     */
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (ontology == null) {
            throw new MojoFailureException("Ontology file name required");
        }
        if (packageName == null) {
            throw new MojoFailureException("Package name required");
        }
        List<String> arguments = new ArrayList<>();
        if (deleteDirectory) {
            arguments.add("-d");
        }
        arguments.add("-f");
        arguments.add(factoryName);
        arguments.add("-o");
        arguments.add(outputDirectory.getAbsolutePath());
        arguments.add("-p");
        arguments.add(packageName);
        if (reasoner != null) {
            arguments.add("-r");
            arguments.add(reasoner);
        }
        arguments.add(ontology.getAbsolutePath());

        getLog().info("Generating code");
        try {
            GenerateSimpleJavaCode.main(arguments.toArray(new String[arguments.size()]));
        } catch (Exception e) {
            getLog().error(String.format("Error generating"), e);
            throw new MojoExecutionException("Error in generation", e);
        }
    }
}
