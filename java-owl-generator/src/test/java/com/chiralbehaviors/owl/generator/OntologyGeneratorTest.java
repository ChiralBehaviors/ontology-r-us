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
package com.chiralbehaviors.owl.generator;

import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.SetOntologyID;

/**
 * @author hparry
 *
 */
public class OntologyGeneratorTest {
    
    @Test
    public void testCreate() throws Exception {
        // We first need to create an OWLOntologyManager, which will provide a
        // point for creating, loading and saving ontologies. We can create a
        // default ontology manager with the OWLManager class. This provides a
        // common setup of an ontology manager. It registers parsers etc. for
        // loading ontologies in a variety of syntaxes
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // In OWL 2, an ontology may be named with an IRI (Internationalised
        // Resource Identifier) We can create an instance of the IRI class as
        // follows:
        IRI ontologyIRI = IRI
                .create("http://www.semanticweb.org/ontologies/myontology");
        // Here we have decided to call our ontology
        // "http://www.semanticweb.org/ontologies/myontology" If we publish our
        // ontology then we should make the location coincide with the ontology
        // IRI Now we have an IRI we can create an ontology using the manager
        OWLOntology ontology = manager.createOntology(ontologyIRI);
        System.out.println("Created ontology: " + ontology);
        // In OWL 2 if an ontology has an ontology IRI it may also have a
        // version IRI The OWL API encapsulates ontology IRI and possible
        // version IRI information in an OWLOntologyID Each ontology knows about
        // its ID
        OWLOntologyID ontologyID = ontology.getOntologyID();
        // In this case our ontology has an IRI but does not have a version IRI
        System.out.println("Ontology IRI: " + ontologyID.getOntologyIRI());
        // Our version IRI will be null to indicate that we don't have a version
        // IRI
        System.out.println("Ontology Version IRI: "
                + ontologyID.getVersionIRI());
        // An ontology may not have a version IRI - in this case, we count the
        // ontology as an anonymous ontology. Our ontology does have an IRI so
        // it is not anonymous:
        System.out.println("Anonymous Ontology: " + ontologyID.isAnonymous());
        // Once an ontology has been created its ontology ID (Ontology IRI and
        // version IRI can be changed) to do this we must apply a SetOntologyID
        // change through the ontology manager. Lets specify a version IRI for
        // our ontology. In our case we will just "extend" our ontology IRI with
        // some version information. We could of course specify any IRI for our
        // version IRI.
        IRI versionIRI = IRI.create(ontologyIRI + "/version1");
        // Note that we MUST specify an ontology IRI if we want to specify a
        // version IRI
        OWLOntologyID newOntologyID = new OWLOntologyID(ontologyIRI, versionIRI);
        // Create the change that will set our version IRI
        SetOntologyID setOntologyID = new SetOntologyID(ontology, newOntologyID);
        // Apply the change
        manager.applyChange(setOntologyID);
        System.out.println("Ontology: " + ontology);
        // We can also just specify the ontology IRI and possibly the version
        // IRI at ontology creation time Set up our ID by specifying an ontology
        // IRI and version IRI
        IRI ontologyIRI2 = IRI
                .create("http://www.semanticweb.org/ontologies/myontology2");
        IRI versionIRI2 = IRI
                .create("http://www.semanticweb.org/ontologies/myontology2/newversion");
        OWLOntologyID ontologyID2 = new OWLOntologyID(ontologyIRI2, versionIRI2);
        // Now create the ontology
        OWLOntology ontology2 = manager.createOntology(ontologyID2);
        System.out.println("Created ontology: " + ontology2);
        // Finally, if we don't want to give an ontology an IRI, in OWL 2 we
        // don't have to
        OWLOntology anonOntology = manager.createOntology();
        System.out.println("Created ontology: " + anonOntology);
        // This ontology is anonymous
        System.out.println("Anonymous: " + anonOntology.isAnonymous());
    }

}
