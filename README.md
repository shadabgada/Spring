# Spring

## Relevant code is present in below packages

### Spring-in-5-steps in 'latest' branch
- com.learning.basics.Springin5steps => qualifer, autowiring
- com.learning.basics.scope => different scopes in spring

### SpringConcepts
- com.spring.SpringConcepts => after removing SpringBoot dependencies
- com.spring.XML => related to spring using xml
- com.spring.applicationProperties => reading properties file

###  JUnit (Java)
- /src => com.shadab.junit. (code)
- /test => com.shadab.junit. (unit tests)

### Mockito (Java)
- In both src and test folder => com.shadab.mockito.mockito.demo
- SomeBusinessMockTest => Mock test without annotations
- SomeBusinessMockAnnotationTest => with annotations
- MockitoDemoApplicationTests => this file is present by default
- SomeBusinessTest => same testing without Mock
- ListTest => mock testing with list


### Spring-Unittest
- In test folder: SomeBusinessImplTest => JUnit
- In test folder: SomeBusinessImplMockito => Mockito

#### Notes:
- code and test must be in same package but different folder
- to remove 1st line error from POX.xml. add this to properties => <maven-jar-plugin.version>3.1.1</maven-jar-plugin.version>
