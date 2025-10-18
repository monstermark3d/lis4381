// Javadoc: documentation generator for generating
// API documentation in HTML format from Java source code.
// https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html
//
class Main
{
 public static void main(String args[])
 {
    //call static void methods (ie. no object, non-value returning)
    Methods.getRequirements();
    Methods.validateUserInput();
 }
}