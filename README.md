# micronaut-hibernate-reactive-bug-demo

Demo for a bug when enable eager initialization and using `data-hibernate-reactive` from on a micronaut application.

## Running demo

First you should initialize a DB for a connection (not mandatory for the exception, but may be helpful when checking with eager initialization disabled to see that the application is suppose to run):

```
docker compose up -d
```

Then, simply run the following to see the exception:

```bash
./mnvw clean mn:run
```

## Micronaut 4.6.2 Documentation

- [User Guide](https://docs.micronaut.io/4.6.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.6.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.6.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)

---

- [Micronaut Maven Plugin documentation](https://micronaut-projects.github.io/micronaut-maven-plugin/latest/)

## Feature maven-enforcer-plugin documentation

- [https://maven.apache.org/enforcer/maven-enforcer-plugin/](https://maven.apache.org/enforcer/maven-enforcer-plugin/)

## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)

## Feature spring documentation

- [Micronaut Spring Framework Annotations documentation](https://micronaut-projects.github.io/micronaut-spring/latest/guide/index.html)

## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)
