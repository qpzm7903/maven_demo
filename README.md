## 使用

1. mvn clean install
2. mvnDebug com.qpzm7903.maven.plugin:hello_world:hello

```text
[INFO]
[INFO] ---------------< com.qpzm7903.maven.plugin:hello_world >----------------
[INFO] Building mvn_plugin_demo Maven Plugin 1.0.0-SNAPSHOT
[INFO] ----------------------------[ maven-plugin ]----------------------------
[INFO]
[INFO] --- hello_world:1.0.0-SNAPSHOT:hello (default-cli) @ hello_world ---
[INFO] -----------------------
[INFO] hello , maven plugin world
[INFO] -----------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.382 s
[INFO] Finished at: 2021-05-29T20:45:22+08:00
[INFO] ------------------------------------------------------------------------

```

## 调试插件

`mvnDebug com.qpzm7903.maven.plugin:hello_world:hello`

## todo

获取一个依赖的具体位置，然后复制到指定的位置