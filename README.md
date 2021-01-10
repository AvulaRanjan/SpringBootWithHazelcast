# SpringBootWithHazelcast

Getting Started

	Added dependency

	spring-boot-starter-cache

	To use caching in your Spring Boot application, you need to:

	1. add org.springframework.boot:spring-boot-starter-cache dependency
	2. add @EnableCaching annotation to your main class
	3. add @Cacheable("books") annotation to every method you want to cache

	Run SpringBootWithHazelcastApplication.java 

	You can test the application by opening this url from the browser.

	http://localhost:9090/examples/1234

	The first time you execute this command it should take some time to get the response. However, when you try it again, it’s instant. That means that the cache is used.


	Run Spring boot in different  port 

	Run this command in your cmd  :- java -jar -Dserver.port=9000 SpringBootWithHazelcast-0.0.1-SNAPSHOT.jar

Server logs 

	2021-01-09 23:17:00.374  WARN 15004 --- [  restartedMain] com.hazelcast.cp.CPSubsystem             : [10.0.0.52]:5701 [dev] [4.0.2] CP Subsystem is not enabled. CP data structures will operate in UNSAFE mode! Please note that UNSAFE mode will not provide strong consistency guarantees.
	2021-01-09 23:17:00.765  INFO 15004 --- [  restartedMain] c.h.s.i.o.impl.OperationExecutorImpl     : [10.0.0.52]:5701 [dev] [4.0.2] Starting 8 partition threads and 5 generic threads (1 dedicated for priority tasks)
	2021-01-09 23:17:00.768  INFO 15004 --- [  restartedMain] c.h.internal.diagnostics.Diagnostics     : [10.0.0.52]:5701 [dev] [4.0.2] Diagnostics disabled. To enable add -Dhazelcast.diagnostics.enabled=true to the JVM arguments.
	2021-01-09 23:17:00.773  INFO 15004 --- [  restartedMain] com.hazelcast.core.LifecycleService      : [10.0.0.52]:5701 [dev] [4.0.2] [10.0.0.52]:5701 is STARTING
	2021-01-09 23:17:03.196  INFO 15004 --- [  restartedMain] c.h.internal.cluster.ClusterService      : [10.0.0.52]:5701 [dev] [4.0.2] 

	Members {size:1, ver:1} [
		Member [10.0.0.52]:5701 - e994aa9c-af05-4a7c-bbec-e5a79f8b67cc this
	]

	2021-01-09 23:17:03.213  INFO 15004 --- [  restartedMain] com.hazelcast.core.LifecycleService      : [10.0.0.52]:5701 [dev] [4.0.2] [10.0.0.52]:5701 is STARTED
	2021-01-09 23:17:03.462  INFO 15004 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
	2021-01-09 23:17:03.718  INFO 15004 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
	2021-01-09 23:17:03.751  INFO 15004 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
	2021-01-09 23:17:03.765  INFO 15004 --- [  restartedMain] c.e.d.SpringBootWithHazelcastApplication : Started SpringBootWithHazelcastApplication in 7.64 seconds (JVM running for 8.331)


	1st time : http://localhost:9090/examples/1234

		 First time service call
		 Values are store in cache
		 Cached Use details



	2nd time :- http://localhost:9090/examples/1234
	      you don't see the log message because  reading from the cached data 

