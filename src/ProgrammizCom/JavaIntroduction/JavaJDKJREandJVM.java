package ProgrammizCom.JavaIntroduction;

public class JavaJDKJREandJVM {

    public static void main(String[] args){
        /*

        What is JVM?

JVM (Java Virtual Machine) is an abstract machine that enables your computer to run a Java program.

When you run the Java program, Java compiler first compiles your Java code to bytecode. Then, the JVM translates bytecode into native machine code (set of instructions that a computer's CPU executes directly).

Java is a platform-independent language. It's because when you write Java code, it's ultimately written for JVM but not your physical machine (computer). Since JVM ​executes the Java bytecode which is platform-independent, Java is platform-independent.

            java compiler                JVM               CPU
JAVA PROGRAM ------------> JAVA BYTECODE----->MACHINE CODE----->OUTPUT

What is JRE?

JRE (Java Runtime Environment) is a software package that provides Java class libraries, Java Virtual Machine (JVM), and other components that are required to run Java applications.

JRE is the superset of JVM.

                 JRE
              JVM + Class Libraries
                java Runtime Environment


What is JDK?

JDK (Java Development Kit) is a software development kit required to develop applications in Java. When you download JDK, JRE is also downloaded with it.

In addition to JRE, JDK also contains a number of development tools (compilers, JavaDoc, Java Debugger, etc).

Relationship between JVM, JRE, and JDK.


                     JDK
                      |
                     JVM
        JRE           +
                 Class Libraries
                      +
                 Compilers
                 Dubuggers
                 JavaDocs



         */

    }

}
