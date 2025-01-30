# gRPC_Testing_Framework  

# Introduction 

The **gRPC Automation Framework** is a robust, scalable solution for automating the testing of gRPC services using Java. It leverages industry-standard tools such as Maven, Cucumber, TestNG, and gRPC libraries to provide a streamlined and user-friendly approach to validating gRPC APIs. This framework simplifies the testing process, ensuring efficient communication with gRPC servers, handling Protobuf message serialization/deserialization, and offering comprehensive reporting capabilities

## Directory Structure
```
grpc-automation-framework/
├── src/
│   ├── main/
│   │   ├── java/          # Java source files
│   │   ├── proto/         # Protobuf files
│   │   ├── resources/     # Application resources
│   │   │   ├── config/    # Configuration files
│   │   │   ├── features/  # Cucumber feature files
│   └── test/
│       ├── java/          # Test cases
│       ├── resources/     # Test-specific resources
├── target/                # Compiled classes and generated files
├── pom.xml                # Maven configuration
```

---
 
# Getting started 
To get started with the gRPC Automation Framework, follow these steps:

## Prerequisites
Ensure you have the following installed:
- Java 8 or higher
- Maven 3
---

## Setup Instructions
1. Navigate to the root directory 
```
cd gRPC_Framework
```
2. Clean and install the Maven project to generate Java files from the .proto definitions, run test cases, and generate a report:
```
mvn clean install 
```

## pom.xml
In addition to the basic Maven installation, the pom.xml file configures several important plugins and dependencies for your framework. These include support for generating Java classes from .proto files, running Cucumber tests, generating reports, and more. Here's an overview of the Maven configuration in the pom.xml.

### Dependencies Overview
1. gRPC Dependencies: These dependencies handle the communication with the gRPC server and manage protobuf messages.

    - grpc-netty-shaded: Provides a netty-based transport for gRPC.
    - grpc-protobuf: Facilitates the interaction with Protobuf messages.
    - grpc-stub: Provides the gRPC client stubs.
    - grpc-testing: Allows testing of gRPC services during the test phase.
    - protobuf-java: For working with Protobuf objects.

2. Cucumber Dependencies: These dependencies are used to run Cucumber tests:
    - cucumber-java and cucumber-junit: To enable the integration of Cucumber with JUnit for running BDD-style tests.
    - cucumber-reporting: For generating detailed reports on test execution.

3. Protobuf Compiler (protoc): The protobuf-maven-plugin generates Java classes from .proto files. You can modify its configuration to customize the output directory or plugin versions.

---
## What Happens During Maven Build:

- Generate Java Files: The protobuf-maven-plugin compiles .proto files into Java classes. These classes are necessary for handling gRPC communication and managing Protobuf message structures.

- Run Test Cases: The maven-surefire-plugin runs the tests defined in your framework. This plugin is also responsible for generating test reports.

- Generate Reports: The maven-cucumber-reporting plugin generates HTML reports after the tests have been executed. The reports are placed in the target/cucumber-reports directory.x

## Viewing Reports

After running the tests, navigate to the report directory to view the test execution summary. Typically, you can find the reports here:
```
target/cucumber-reports/cucumber-html-reports/overview-features.html
```

# Package Breakdown 
## hooks: ``` com.grpc.hooks```
The hooks package contains lifecycle management code for test execution, ensuring proper setup and teardown of resources.

### Key Responsibilities
#### @Before methode 
- Initializes configuration properties.
- Establishes a gRPC channel.
- Initializes the reporting system for the scenario.

#### @After methode 
- Closes the gRPC channel.
- Generates and prints the test execution status using.

---

## utils: ``` com.grpc.utils```
The utils package contains utility classes that provide essential support for the framework. These include configuration management, gRPC channel handling, and reporting functionalities.

### ```ChannelManager.java```
Handles the creation, management, and cleanup of gRPC channels.

#### Key Methods:
- **initChannel()**: Initializes a gRPC channel for communication with the server.
- **closeChannel()**: Closes the active gRPC channel to release resources.

### ```ConfigReader.java```
Reads and manages configuration properties for the framework.

#### Key Methods:
- initProperties(): Loads properties from the config.properties file.
- getProperites(): Returns the property value for the corresponding key.

### ```ReportManager.java```
Manages the generation and handling of test execution reports.
#### Key Methods:
- **initReport(Scenario s)**: Initializes the reporting process for a specific scenario.
- **printStatus()**: Prints the overall status of the test execution.
- Additional methods for writing detailed test execution data.

---
## runner: ```com.grpc.runner```
The runner package contains the entry point for executing test cases.

### Annotations:

- @RunWith(Cucumber.class): Specifies that the class will use the Cucumber JUnit runner.
- @CucumberOptions: Provides configuration for the test execution.

### Options:
- **features**: Points to the directory containing Cucumber feature files.
- **glue**: Specifies the packages containing step definitions and hooks.
- **plugin**: Generates a JSON report in the specified location.
- **tags**: Allows selective execution of tagged scenarios.

This class acts as the central configuration for running Cucumber-based tests within the framework.

---
## Service-Specific package: `com.grpc.service`
For each gRPC service defined in a `.proto` file, there is a corresponding package. These service-specific packages are organized into sub-packages that manage requests, responses, and step definitions for testing the service's functionality. For example:

#### Example Service: `user_service`

```
com.grpc.user_service
├── request
├── response
└── steps
```

#### Sub-Package: `request`
Contains classes representing gRPC requests for the service. These classes are responsible for constructing and populating request objects.

Eg:-
- **AddUserRequest.java**: Constructs and manages the payload for adding a new user.
- **GetAllUserRequest.java**: Constructs and manages the payload for retrieving all users.

#### Sub-Package: `response`
Contains classes for processing gRPC responses for the service. These classes handle the parsing and interpretation of server responses.

Eg:-
- **AddUserResponse.java**: Processes the response received after adding a new user.
- **GetAllUserResponse.java**: Processes the response received after retrieving all users.

#### Sub-Package: `steps`
Contains step definition classes for Cucumber tests. These classes map Cucumber feature steps to Java methods that execute the test logic.

Eg:-
- **AddUserRequestSteps.java**: Defines steps for testing the `AddUser` gRPC operation.
- **GetAllUserRequestSteps.java**: Defines steps for testing the `GetAllUser` gRPC operation.

This structure is replicated for each service, ensuring a modular and organized approach to managing gRPC service testing.

---
## Proto Files

The `proto` folder contains `.proto` files that define the structure and behavior of gRPC services. These files serve as the foundation for generating Java classes and implementing gRPC operations.

### Example Overview:
1. **Syntax**: The `.proto` files use `proto3` syntax.
2. **Messages**: Define the data structures exchanged between the client and server.
3. **Services**: Define the RPC methods exposed by the server.

### Workflow:
- The Protobuf compiler processes these `.proto` files to generate corresponding Java classes.
- Generated classes are used for creating requests, handling responses, and implementing gRPC services.

---

## Resources

The `resources` directory contains supporting files required for test execution and configuration management.

### 1. Configuration (`config.properties`)
The `config.properties` file holds the configuration settings for the framework. This central file allows customization without modifying the codebase.

#### Example:
```
base.url=localhost
base.url.port=8081
```

### Key Properties:
- **`base.url`**: Specifies the gRPC server host.
- **`base.url.port`**: Specifies the port for the gRPC server.

### 2. Feature Files (`features`)
The `features` folder contains Cucumber feature files that define test scenarios in plain English.

### Key Elements:
- **Feature**: Describes the functionality being tested.
- **Scenario Outline**: Defines a parameterized test case.
- **Steps**: Written in Gherkin syntax (`Given`, `When`, `Then`, `And`) to map to step definitions in the Java code.
- **Examples**: Provide test data for the scenario outline.

These files bridge the gap between non-technical stakeholders and developers by enabling collaboration on test case definitions.

---

# Contribute