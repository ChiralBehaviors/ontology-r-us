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

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

/**
 * @author hhildebrand
 *
 */
public class TestOwlToJavaGenerator {

    @Test
    public void testGenerate() throws Exception {
        String packageName = "com.ontologyRus";
        OwlToJavaGenerator generator = new OwlToJavaGenerator(
                                                              true,
                                                              "WayOutShitMan",
                                                              OwlToJavaGenerator.DEFAULT_OUTPUT_DIRECTORY,
                                                              packageName,
                                                              null,
                                                              new File(
                                                                       "target/test-classes/CodeGeneration001.owl"));
        generator.execute();
        assertTrue("Generated files do not exist",
                   new File(OwlToJavaGenerator.DEFAULT_OUTPUT_DIRECTORY,
                            String.format("%s/A1.java",
                                          packageName.replace('.', '/'))).exists());
    }
}
