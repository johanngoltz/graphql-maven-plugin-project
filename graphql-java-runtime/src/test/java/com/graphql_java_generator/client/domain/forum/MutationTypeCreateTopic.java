package com.graphql_java_generator.client.domain.forum;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class MutationTypeCreateTopic {

	@JsonProperty("createTopic")
	Topic createTopic;

	public void setCreateTopic(Topic createTopic) {
		this.createTopic = createTopic;
	}

	public Topic getCreateTopic() {
		return createTopic;
	}
	
    @Override
	public String toString() {
        return "MutationTypeCreateTopic {createTopic: " + createTopic + "}";
    }
}
