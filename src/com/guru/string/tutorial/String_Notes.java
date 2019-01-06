package com.guru.string.tutorial;

 /*
 * java.lang.String
 * - Object backed by char array
 * - immutable and final
 * - String pool /Intern
 * - Why immutable ?
 *      -use with String pool cache
 *      -thread safe
 *      -caches hash code
 * - String APIs
 *      -IndexOf, lastIndexOf,contains,matches
 *      -regular expression
 *      -substring
 *         memory leak up to jdk 7.0
 *       
 *  - StringBuffer, StringBuilder,String
 *  -
 *  - +Operator vs StringBuilder.append vs concat
 *  
 *   - Storing Password
 *   
 *   It is not required that if two objects are unequal according to the equals(java.lang.Object) method,
 *    then calling the hashCode method on each of the two objects must produce distinct integer results.
 *     However, the programmer should be aware that producing distinct integer results for unequal 
 *     objects may improve the performance of hashtables.
 *     
 *     
 *     Immutable class is good for caching purpose because you don’t need to worry about the value changes.
 *     Other benefit of immutable class is that it is inherently thread-safe, 
 *     so you don’t need to worry about thread safety in case of multi-threaded environment.
 *     
 *     
 *     How to create Immutable class in Java?
 *     Following are the requirements:
       • Class must be declared as final (So that child classes can’t be created)
       • Data members in the class must be declared as final (So that we can’t change the value
        of it after object creation)
       • A parameterized constructor
       • Getter method for all the variables in it
       • No setters(To not have option to change the value of the instance variable)
       • If the class holds a mutable object:
            -Inside the constructor, make sure to use a clone copy of the passed argument and 
                never set your mutable field to the real instance passed through constructor, 
                this is to prevent the clients who pass the object from modifying it afterwards.
             -Make sure to always return a clone copy of the field and never return the real object
              instance.
 */     
public class String_Notes {
  
	public String s=null;

}
