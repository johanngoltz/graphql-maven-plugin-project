package graphql.java.client.domain.forum;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import graphql.java.client.annotation.GraphQLNonScalar;
import graphql.java.client.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @See https://github.com/graphql-java-generator/graphql-java-generator
 */

public class Board  {

	@GraphQLScalar(graphqlType = String.class)
	String id;


	@GraphQLScalar(graphqlType = String.class)
	String name;


	@GraphQLScalar(graphqlType = Boolean.class)
	Boolean publiclyAvailable;


	@GraphQLNonScalar(graphqlType = Topic.class)
	@JsonDeserialize(contentAs = Topic.class)
	List<Topic> topics;



	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPubliclyAvailable(Boolean publiclyAvailable) {
		this.publiclyAvailable = publiclyAvailable;
	}

	public Boolean getPubliclyAvailable() {
		return publiclyAvailable;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public List<Topic> getTopics() {
		return topics;
	}

    public String toString() {
        return "Board {"
				+ "id: " + id
				+ ", "
				+ "name: " + name
				+ ", "
				+ "publiclyAvailable: " + publiclyAvailable
				+ ", "
				+ "topics: " + topics
        		+ "}";
    }
}
