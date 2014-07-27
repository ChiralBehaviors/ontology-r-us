/**
 * Copyright (c) 2014 Chiral Behaviors, LLC, all rights reserved.
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
package com.chiralbehaviors.owlGenerator;

import java.util.Collection;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import com.chiralbehaviors.CoRE.agency.Agency;
import com.chiralbehaviors.CoRE.workspace.Workspace;

/**
 * @author hparry
 *
 */
public class OwlGenerator {

    private static final String IRI_FORMAT = "com.chiralbehaviors.ultrastructure/%s/%s";

    public static void generateSelfContainedOntology(Workspace workspace)
                                                                         throws OWLOntologyCreationException {
        OWLOntologyManager m = new UltrastructureOntologyManager();
        OWLOntology o = m.createOntology();

        Collection<Agency> agencies = workspace.getAgencies();
        for (Agency agency : agencies) {
            IRI a = IRI.create(String.format(IRI_FORMAT,
                                             Agency.class.getSimpleName(),
                                             agency.getName()));
            
        }
    }

}
