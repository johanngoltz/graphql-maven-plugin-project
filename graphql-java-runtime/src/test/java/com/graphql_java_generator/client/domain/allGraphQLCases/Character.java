package com.graphql_java_generator.client.domain.allGraphQLCases;

import java.util.List;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

import java.util.Date;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public interface Character  {

	@GraphQLScalar(graphQLTypeName = "ID", javaClass = String.class)
	public void setId(String id);

	@GraphQLScalar(graphQLTypeName = "ID", javaClass = String.class)
	public String getId();

	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	public void setName(String name);

	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	public String getName();

	@JsonDeserialize(contentAs = CharacterImpl.class)
	@GraphQLNonScalar(graphQLTypeName = "Character", javaClass = Character.class)
	public void setFriends(List<Character> friends);

	@JsonDeserialize(contentAs = CharacterImpl.class)
	@GraphQLNonScalar(graphQLTypeName = "Character", javaClass = Character.class)
	public List<Character> getFriends();

	@JsonDeserialize(contentAs = Episode.class)
	@GraphQLScalar(graphQLTypeName = "Episode", javaClass = Episode.class)
	public void setAppearsIn(List<Episode> appearsIn);

	@JsonDeserialize(contentAs = Episode.class)
	@GraphQLScalar(graphQLTypeName = "Episode", javaClass = Episode.class)
	public List<Episode> getAppearsIn();
}