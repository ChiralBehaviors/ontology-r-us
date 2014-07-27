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

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLOntologyDocumentTarget;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.ImpendingOWLOntologyChangeListener;
import org.semanticweb.owlapi.model.MissingImportListener;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLImportsDeclaration;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLOntologyChangeBroadcastStrategy;
import org.semanticweb.owlapi.model.OWLOntologyChangeListener;
import org.semanticweb.owlapi.model.OWLOntologyChangeProgressListener;
import org.semanticweb.owlapi.model.OWLOntologyChangesVetoedListener;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyFactory;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.OWLOntologyIRIMapper;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.OWLOntologyLoaderListener;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyRenameException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLOntologyStorer;
import org.semanticweb.owlapi.model.UnknownOWLOntologyException;
import org.semanticweb.owlapi.model.UnloadableImportException;

/**
 * @author hparry
 *
 */
public class UltrastructureOntologyManager implements OWLOntologyManager {

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getOWLDataFactory()
     */
    @Override
    public OWLDataFactory getOWLDataFactory() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getOntologies()
     */
    @Override
    public Set<OWLOntology> getOntologies() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getOntologies(org.semanticweb.owlapi.model.OWLAxiom)
     */
    @Override
    public Set<OWLOntology> getOntologies(OWLAxiom axiom) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getVersions(org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public Set<OWLOntology> getVersions(IRI ontology) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#contains(org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public boolean contains(IRI ontologyIRI) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#contains(org.semanticweb.owlapi.model.OWLOntologyID)
     */
    @Override
    public boolean contains(OWLOntologyID id) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#containsVersion(org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public boolean containsVersion(IRI ontologyVersionIRI) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getOntologyIDsByVersion(org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public Set<OWLOntologyID> getOntologyIDsByVersion(IRI ontologyVersionIRI) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getOntology(org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public OWLOntology getOntology(IRI ontologyIRI) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getOntology(org.semanticweb.owlapi.model.OWLOntologyID)
     */
    @Override
    public OWLOntology getOntology(OWLOntologyID ontologyID) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getImportedOntology(org.semanticweb.owlapi.model.OWLImportsDeclaration)
     */
    @Override
    public OWLOntology getImportedOntology(OWLImportsDeclaration declaration) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getDirectImports(org.semanticweb.owlapi.model.OWLOntology)
     */
    @Override
    public Set<OWLOntology> getDirectImports(OWLOntology ontology) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getImports(org.semanticweb.owlapi.model.OWLOntology)
     */
    @Override
    public Set<OWLOntology> getImports(OWLOntology ontology) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getImportsClosure(org.semanticweb.owlapi.model.OWLOntology)
     */
    @Override
    public Set<OWLOntology> getImportsClosure(OWLOntology ontology) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getSortedImportsClosure(org.semanticweb.owlapi.model.OWLOntology)
     */
    @Override
    public List<OWLOntology> getSortedImportsClosure(OWLOntology ontology) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#applyChanges(java.util.List)
     */
    @Override
    public List<OWLOntologyChange> applyChanges(List<? extends OWLOntologyChange> changes)
                                                                                          throws OWLOntologyRenameException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addAxioms(org.semanticweb.owlapi.model.OWLOntology, java.util.Set)
     */
    @Override
    public List<OWLOntologyChange> addAxioms(OWLOntology ont,
                                             Set<? extends OWLAxiom> axioms) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addAxiom(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.model.OWLAxiom)
     */
    @Override
    public List<OWLOntologyChange> addAxiom(OWLOntology ont, OWLAxiom axiom) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeAxiom(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.model.OWLAxiom)
     */
    @Override
    public List<OWLOntologyChange> removeAxiom(OWLOntology ont, OWLAxiom axiom) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeAxioms(org.semanticweb.owlapi.model.OWLOntology, java.util.Set)
     */
    @Override
    public List<OWLOntologyChange> removeAxioms(OWLOntology ont,
                                                Set<? extends OWLAxiom> axioms) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#applyChange(org.semanticweb.owlapi.model.OWLOntologyChange)
     */
    @Override
    public List<OWLOntologyChange> applyChange(OWLOntologyChange change)
                                                                        throws OWLOntologyRenameException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#createOntology()
     */
    @Override
    public OWLOntology createOntology() throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#createOntology(java.util.Set)
     */
    @Override
    public OWLOntology createOntology(Set<OWLAxiom> axioms)
                                                           throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#createOntology(java.util.Set, org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public OWLOntology createOntology(Set<OWLAxiom> axioms, IRI ontologyIRI)
                                                                            throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#createOntology(org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public OWLOntology createOntology(IRI ontologyIRI)
                                                      throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#createOntology(org.semanticweb.owlapi.model.OWLOntologyID)
     */
    @Override
    public OWLOntology createOntology(OWLOntologyID ontologyID)
                                                               throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#createOntology(org.semanticweb.owlapi.model.IRI, java.util.Set, boolean)
     */
    @Override
    public OWLOntology createOntology(IRI ontologyIRI,
                                      Set<OWLOntology> ontologies,
                                      boolean copyLogicalAxiomsOnly)
                                                                    throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#createOntology(org.semanticweb.owlapi.model.IRI, java.util.Set)
     */
    @Override
    public OWLOntology createOntology(IRI ontologyIRI,
                                      Set<OWLOntology> ontologies)
                                                                  throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#loadOntology(org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public OWLOntology loadOntology(IRI ontologyIRI)
                                                    throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#loadOntologyFromOntologyDocument(org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public OWLOntology loadOntologyFromOntologyDocument(IRI documentIRI)
                                                                        throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#loadOntologyFromOntologyDocument(java.io.File)
     */
    @Override
    public OWLOntology loadOntologyFromOntologyDocument(File file)
                                                                  throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#loadOntologyFromOntologyDocument(java.io.InputStream)
     */
    @Override
    public OWLOntology loadOntologyFromOntologyDocument(InputStream inputStream)
                                                                                throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#loadOntologyFromOntologyDocument(org.semanticweb.owlapi.io.OWLOntologyDocumentSource)
     */
    @Override
    public OWLOntology loadOntologyFromOntologyDocument(OWLOntologyDocumentSource documentSource)
                                                                                                 throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#loadOntologyFromOntologyDocument(org.semanticweb.owlapi.io.OWLOntologyDocumentSource, org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration)
     */
    @Override
    public OWLOntology loadOntologyFromOntologyDocument(OWLOntologyDocumentSource documentSource,
                                                        OWLOntologyLoaderConfiguration config)
                                                                                              throws OWLOntologyCreationException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeOntology(org.semanticweb.owlapi.model.OWLOntology)
     */
    @Override
    public void removeOntology(OWLOntology ontology) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeOntology(org.semanticweb.owlapi.model.OWLOntologyID)
     */
    @Override
    public void removeOntology(OWLOntologyID ontologyID) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getOntologyDocumentIRI(org.semanticweb.owlapi.model.OWLOntology)
     */
    @Override
    public IRI getOntologyDocumentIRI(OWLOntology ontology) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#setOntologyDocumentIRI(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public void setOntologyDocumentIRI(OWLOntology ontology, IRI documentIRI)
                                                                             throws UnknownOWLOntologyException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getOntologyFormat(org.semanticweb.owlapi.model.OWLOntology)
     */
    @Override
    public OWLOntologyFormat getOntologyFormat(OWLOntology ontology)
                                                                    throws UnknownOWLOntologyException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#setOntologyFormat(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.model.OWLOntologyFormat)
     */
    @Override
    public void setOntologyFormat(OWLOntology ontology,
                                  OWLOntologyFormat ontologyFormat) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#saveOntology(org.semanticweb.owlapi.model.OWLOntology)
     */
    @Override
    public void saveOntology(OWLOntology ontology)
                                                  throws OWLOntologyStorageException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#saveOntology(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public void saveOntology(OWLOntology ontology, IRI documentIRI)
                                                                   throws OWLOntologyStorageException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#saveOntology(org.semanticweb.owlapi.model.OWLOntology, java.io.OutputStream)
     */
    @Override
    public void saveOntology(OWLOntology ontology, OutputStream outputStream)
                                                                             throws OWLOntologyStorageException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#saveOntology(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.model.OWLOntologyFormat)
     */
    @Override
    public void saveOntology(OWLOntology ontology,
                             OWLOntologyFormat ontologyFormat)
                                                              throws OWLOntologyStorageException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#saveOntology(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.model.OWLOntologyFormat, org.semanticweb.owlapi.model.IRI)
     */
    @Override
    public void saveOntology(OWLOntology ontology,
                             OWLOntologyFormat ontologyFormat, IRI documentIRI)
                                                                               throws OWLOntologyStorageException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#saveOntology(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.model.OWLOntologyFormat, java.io.OutputStream)
     */
    @Override
    public void saveOntology(OWLOntology ontology,
                             OWLOntologyFormat ontologyFormat,
                             OutputStream outputStream)
                                                       throws OWLOntologyStorageException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#saveOntology(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.io.OWLOntologyDocumentTarget)
     */
    @Override
    public void saveOntology(OWLOntology ontology,
                             OWLOntologyDocumentTarget documentTarget)
                                                                      throws OWLOntologyStorageException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#saveOntology(org.semanticweb.owlapi.model.OWLOntology, org.semanticweb.owlapi.model.OWLOntologyFormat, org.semanticweb.owlapi.io.OWLOntologyDocumentTarget)
     */
    @Override
    public void saveOntology(OWLOntology ontology,
                             OWLOntologyFormat ontologyFormat,
                             OWLOntologyDocumentTarget documentTarget)
                                                                      throws OWLOntologyStorageException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addIRIMapper(org.semanticweb.owlapi.model.OWLOntologyIRIMapper)
     */
    @Override
    public void addIRIMapper(OWLOntologyIRIMapper mapper) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeIRIMapper(org.semanticweb.owlapi.model.OWLOntologyIRIMapper)
     */
    @Override
    public void removeIRIMapper(OWLOntologyIRIMapper mapper) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#clearIRIMappers()
     */
    @Override
    public void clearIRIMappers() {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addOntologyFactory(org.semanticweb.owlapi.model.OWLOntologyFactory)
     */
    @Override
    public void addOntologyFactory(OWLOntologyFactory factory) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeOntologyFactory(org.semanticweb.owlapi.model.OWLOntologyFactory)
     */
    @Override
    public void removeOntologyFactory(OWLOntologyFactory factory) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#getOntologyFactories()
     */
    @Override
    public Collection<OWLOntologyFactory> getOntologyFactories() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addOntologyStorer(org.semanticweb.owlapi.model.OWLOntologyStorer)
     */
    @Override
    public void addOntologyStorer(OWLOntologyStorer storer) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeOntologyStorer(org.semanticweb.owlapi.model.OWLOntologyStorer)
     */
    @Override
    public void removeOntologyStorer(OWLOntologyStorer storer) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addOntologyChangeListener(org.semanticweb.owlapi.model.OWLOntologyChangeListener)
     */
    @Override
    public void addOntologyChangeListener(OWLOntologyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addOntologyChangeListener(org.semanticweb.owlapi.model.OWLOntologyChangeListener, org.semanticweb.owlapi.model.OWLOntologyChangeBroadcastStrategy)
     */
    @Override
    public void addOntologyChangeListener(OWLOntologyChangeListener listener,
                                          OWLOntologyChangeBroadcastStrategy strategy) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addImpendingOntologyChangeListener(org.semanticweb.owlapi.model.ImpendingOWLOntologyChangeListener)
     */
    @Override
    public void addImpendingOntologyChangeListener(ImpendingOWLOntologyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeImpendingOntologyChangeListener(org.semanticweb.owlapi.model.ImpendingOWLOntologyChangeListener)
     */
    @Override
    public void removeImpendingOntologyChangeListener(ImpendingOWLOntologyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addOntologyChangesVetoedListener(org.semanticweb.owlapi.model.OWLOntologyChangesVetoedListener)
     */
    @Override
    public void addOntologyChangesVetoedListener(OWLOntologyChangesVetoedListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeOntologyChangesVetoedListener(org.semanticweb.owlapi.model.OWLOntologyChangesVetoedListener)
     */
    @Override
    public void removeOntologyChangesVetoedListener(OWLOntologyChangesVetoedListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#setDefaultChangeBroadcastStrategy(org.semanticweb.owlapi.model.OWLOntologyChangeBroadcastStrategy)
     */
    @Override
    public void setDefaultChangeBroadcastStrategy(OWLOntologyChangeBroadcastStrategy strategy) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeOntologyChangeListener(org.semanticweb.owlapi.model.OWLOntologyChangeListener)
     */
    @Override
    public void removeOntologyChangeListener(OWLOntologyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#makeLoadImportRequest(org.semanticweb.owlapi.model.OWLImportsDeclaration)
     */
    @Override
    public void makeLoadImportRequest(OWLImportsDeclaration declaration)
                                                                        throws UnloadableImportException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#makeLoadImportRequest(org.semanticweb.owlapi.model.OWLImportsDeclaration, org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration)
     */
    @Override
    public void makeLoadImportRequest(OWLImportsDeclaration declaration,
                                      OWLOntologyLoaderConfiguration configuration)
                                                                                   throws UnloadableImportException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#setSilentMissingImportsHandling(boolean)
     */
    @Override
    public void setSilentMissingImportsHandling(boolean b) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#isSilentMissingImportsHandling()
     */
    @Override
    public boolean isSilentMissingImportsHandling() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addMissingImportListener(org.semanticweb.owlapi.model.MissingImportListener)
     */
    @Override
    public void addMissingImportListener(MissingImportListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeMissingImportListener(org.semanticweb.owlapi.model.MissingImportListener)
     */
    @Override
    public void removeMissingImportListener(MissingImportListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addOntologyLoaderListener(org.semanticweb.owlapi.model.OWLOntologyLoaderListener)
     */
    @Override
    public void addOntologyLoaderListener(OWLOntologyLoaderListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeOntologyLoaderListener(org.semanticweb.owlapi.model.OWLOntologyLoaderListener)
     */
    @Override
    public void removeOntologyLoaderListener(OWLOntologyLoaderListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#addOntologyChangeProgessListener(org.semanticweb.owlapi.model.OWLOntologyChangeProgressListener)
     */
    @Override
    public void addOntologyChangeProgessListener(OWLOntologyChangeProgressListener listener) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.semanticweb.owlapi.model.OWLOntologyManager#removeOntologyChangeProgessListener(org.semanticweb.owlapi.model.OWLOntologyChangeProgressListener)
     */
    @Override
    public void removeOntologyChangeProgessListener(OWLOntologyChangeProgressListener listener) {
        // TODO Auto-generated method stub
        
    }

}
