There is a `org.gradle.java.home` property file in `gradle.properties`

If directed to JDK 8 -> works fine. 

If directed to JDK 9, 10 -> fails, sying none of the imports in generated `EntityName_.java` files found

Change `org.gradle.java.home = C:/Program Files/Java/jdk1.8.0_162`
to point to jdk of the preference to see results
