package com.shadab.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

//https://stackoverflow.com/questions/57836937/call-custom-static-functions-from-filter-and-map-in-java-8-stream
//https://www.youtube.com/watch?v=bTTNVP_ORr8

// Based on Custom req.
// Override Test method in case of Filter => returns Boolean value.
// Override apply method in case of Mapper => returns target conversion type

/* 
 We can replace above methods with Lambda Expressions.
 For ex: In case of Mapper, Below line is same as line no 93 (.map method) 
 .map( s -> { return new CharactersCount(s,3); } )
*/


class Filter{
	public static Predicate<String> nameStartingWithPrefix(String nextLine) {
        return new Predicate<String>() {

            @Override
            public boolean test(String t) {
                // System.out.println(t);
                return t.startsWith(nextLine);
            }
        };
    }
}

class Mapper{

// Conversion of String to CharactersCount

	public static Function<String,CharactersCount>getDistinctCharactersCount()
    {
		return new Function<String,CharactersCount>() {

            @Override
            public CharactersCount apply(String s) {
				
				String charArray[]=s.split("");
				Set<String> mySet = new HashSet<>(Arrays.asList(charArray));
                
				return new CharactersCount(s,mySet.size());
            }
        };	
    }


}

class CharactersCount {
    private final String name;
    private final Integer distinctCharacterCount;
    
    public CharactersCount(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }
 
    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }
    
}
 
public class CustomFilterMapper {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );
        
        names.stream()
                .filter(Filter.nameStartingWithPrefix(scanner.nextLine()))
                .map(Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }
}