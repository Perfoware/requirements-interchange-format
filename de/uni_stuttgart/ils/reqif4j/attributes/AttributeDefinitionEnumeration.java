package de.uni_stuttgart.ils.reqif4j.attributes;

import java.util.Map;

import org.w3c.dom.Node;

import de.uni_stuttgart.ils.reqif4j.datatypes.Datatype;

public class AttributeDefinitionEnumeration extends AttributeDefinition {
	
	
	public AttributeDefinitionEnumeration(Node attributeDefinition, Map<String, Datatype> dataTypes) {
		super(attributeDefinition, dataTypes);
		
		
	}

}
