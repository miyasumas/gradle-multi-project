# gradle-multiproject

Gradle でマルチプロジェクトを試す。

## 実行

* CLI
    * 定期的にコンソールに実行結果が表示される。

```bash
$ ./gradlew :cli:bootRun
```

* Web API
    * `http://localhost:8080/hello?n=[数字]` で実行

```bash
$ ./gradlew :web:bootRun
```

## やったこと

* それぞれのサブプロジェクトをディレクトリ以下に作る
    * web
    * cli
    * common → cli, web が参照する
* `settings.gradle` にサブプロジェクトを設定
* 全サブプロジェクトの設定は、親の `build.gradle` の `subprojects` 内に記載
* その他、個々の設定は、それぞれの `build.gradle` に記載

## gradle 実行

* プロジェクトを指定しない場合は、すべてのプロジェクトで同じタスクが実行される。

```bash
$ ./gradlew bootJar
```

* そのプロジェクトだけを実行したい場合は、プロジェクトを指定する。(`:プロジェクト名:タスク名`)

```bash
$ ./gradlew :cli:bootJar
```
