Simply do

```bash
./mvnw spring-boot:run
```

And then hit the / endoint.

```bash
curl localhost:8080
```

will give a 401, and

```bash
curl --user user:pwd localhost:8080 && echo
```

will print out the username.
