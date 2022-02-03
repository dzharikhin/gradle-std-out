# [IDEA-287845](https://youtrack.jetbrains.com/issue/IDEA-287845) test case
### To reproduce the issue:
1. Run [Test](/src/test/java/Test.java) with IDEA using gradle delegation(default)
2. See console output hangs on `> Task :test` with no output from `setUp()` method
3. See all stdout appears in console only when execution finally comes to `test()` itself
### To see expected behavior:
1. Open terminal in project root and execute `./gradlew :test --tests "Test"`
2. See output from `setUp()` method appears in console just in time it should