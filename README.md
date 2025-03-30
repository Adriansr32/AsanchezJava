# MyJavaProject

This project is a comprehensive Java implementation that demonstrates the use of different programming paradigms: structured, modular, and object-oriented. The project implements various systems and functionalities using each paradigm, showcasing the advantages and applications of each programming approach.

## Project Structure

```
MyJavaProject/
├── src/
│   ├── structured/       # Implementations using structured programming
│   ├── modular/          # Independent and reusable modules
│   ├── oop/              # Object-oriented implementations
│   └── tests/            # Unit and integration tests
├── build/                # Compiled files and build results
├── dist/                 # Project distributions and deliverables
├── docs/                 # Project documentation
│   ├── specifications/   # Technical requirements and specifications
│   └── manuals/          # User manuals and guides
├── lib/                  # External libraries and dependencies
├── logs/                 # Log and tracking files
├── resources/            # Project resources
│   ├── config/           # Configuration files
│   ├── data/             # Data and example files
│   └── sql/              # Database scripts
└── tasks/                # Project task management
    ├── completed/        # Completed tasks record
    └── pending/          # To-do task list
```

## Directory Description

### src/ Directory
- **structured/**: Contains implementations using the structured programming paradigm.
- **modular/**: Houses independent modules that can be reused in different parts of the project.
- **oop/**: Object-oriented programming implementations, including the book management system.
- **tests/**: Contains all project tests, both unit and integration.

### Build and Distribution Directories
- **build/**: Stores compiled files and build process results.
- **dist/**: Contains deployable project versions ready for distribution.

### Documentation and Resources
- **docs/**: All project documentation:
  - *specifications/*: Technical documents and system requirements.
  - *manuals/*: User guides and usage documentation.
- **resources/**: Resources needed for the project:
  - *config/*: System configuration files.
  - *data/*: Example data and files needed for testing.
  - *sql/*: Database scripts and schemas.

### Support and Management
- **lib/**: External libraries and dependencies required for the project.
- **logs/**: Log files for monitoring and debugging.
- **tasks/**: Project task management system:
  - *completed/*: Historical record of completed tasks.
  - *pending/*: Backlog and pending tasks.

## Main Components

### Structured Programming
Located in `src/structured/`, implements:
- Basic algorithms and control structures
- Sequential data processing
- Well-defined functions and procedures
- Array and matrix manipulation

### Modular Programming
Located in `src/modular/`, demonstrates:
- Development of independent and reusable modules
- Functionality encapsulation
- Well-defined interfaces between modules
- Efficient dependency management

### Object-Oriented Programming
Located in `src/oop/`, includes:

#### Inheritance System
- Implementation of class hierarchies
- Multiple inheritance demonstration
- Use of interfaces and abstract classes

## System Requirements

- Java JDK 8 or higher
- Java-compatible IDE (Eclipse, IntelliJ IDEA, NetBeans)
- Disk space: 500MB minimum
- RAM: 2GB minimum recommended

## Installation and Setup

1. Clone the repository
2. Import the project into your preferred IDE
3. Configure necessary environment variables
4. Run database scripts in `resources/sql/`
5. Compile the project using the build system

## Development Process

1. New features are developed in feature/ branches
2. Tests are written in src/tests/
3. Code is compiled in build/
4. Distributions are generated in dist/

## Contributing

If you wish to contribute to the project:
1. Fork the repository
2. Create a branch for your feature
3. Follow the style guides in docs/
4. Make sure to add tests
5. Submit a pull request

## Author

Adrián Sánchez

## License

This project is under the MIT License.