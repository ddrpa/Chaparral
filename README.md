# Chaparral

Chaparral is a data desensitize helper designed to work with FasterXML/Jackson.

「欉（cóng，音同丛）」是一款配合 FasterXML/Jackson 使用的数据脱敏工具。

## How to use

添加依赖：

```xml
<dependency>
    <groupId>cc.ddrpa</groupId>
    <artifactId>chaparral</artifactId>
    <version>${chaparral.version}</version>
</dependency>
```

snapshot 版本可以在 [sonatype.org](https://s01.oss.sonatype.org/#nexus-search;quick~cc.ddrpa) 查找。

```xml
<repositories>
    <repository>
        <id>snapshots</id>
        <url>https://s01.oss.sonatype.org/content/repositories/snapshots/</url>
    </repository>
</repositories>
```

在类的属性上添加 `cc.ddrpa.chaparral.annotation.Sensitive` 注解，使用 Jackson 序列化为 JSON 字符串时会应用脱敏规则。

```java
public class SystemUserVO {
    @Sensitive(strategy = DesensitizeStrategy.BANK_ACCOUNT)
    private String bankAccount;
    @Sensitive(strategy = DesensitizeStrategy.CUSTOM, using = cc.ddrpa.chaparral.howto.CustomAddressHandler.class)
    private Address address;
    @Sensitive
    private Integer fieldShouldBeNullingOut;
}
```

输出如下：

```text
{
    "realName": "张*三",
    "idCard": "3****************3",
    "bankAccount": "622307******9940",
    "email": "n***y@ddrpa.cc",
    "mobile": "188****9941",
    "address": {
        "province": "浙江省",
        "city": "杭州市",
        "detail": "西湖区桃源岭*号",
        "zipCode": "310001"
    },
    "fieldShouldBeNullingOut": null
}
```

## 下一步计划

- 支持脱敏后转换成其他类型，例如 `java.time.LocalDate.of(2023, 1, 23)` 转换成字符串 `2023/**/**`。
