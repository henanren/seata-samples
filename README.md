<img src="https://github.com/seata/seata-samples/blob/master/doc/img/seata.png"  height="100" width="426">
在seata-server端的file.conf配置文件中，有个default.grouplist配置，是干嘛的呢？
1.作用方式
这个配置，只有当registry.type=file，注册中心是file方式时，才会起作用。

2.配置
这个值可以配置多个，配置多个就是集群方式。由于并未提供本地文件的同步，所以，在store.mode=file模式下，这种集群方式的配置会报错，如果配置为集群，store.mode=db，这样可以通过db来共享TC集群间的数据。

3.作用
当 registry.type=file时，这个default.grouplist才会用到，但是file方式，并不能提供一个注册中心的完整功能，比如健康检查机制，实例列表的更新剔出等，注册中心还是要使用专业的比较好，比如现在已经支持的nacos 、eureka、redis、zk、consul、etcd3、sofa。

registry.type=file 或 config.type=file 设计的初衷，是让用户在不依赖第三方注册中心或配置中心的前提下，可以通过file这种简单的直连快速验证 Seata 服务，快速上手。
 

# Seata Samples   seata-samples，官网demo，可用，自己测试。

Samples for Seata. This project contains several sub-projects, each of which is an example of integration with other projects.
                                
[![Build Status](https://travis-ci.org/seata/seata-samples.svg?branch=master)](https://travis-ci.org/seata/seata-samples) 
![license](https://img.shields.io/github/license/seata/seata-samples.svg)

## Related repository

* [Seata](https://github.com/seata/seata) - The Seata core project

## Sub-projects

* [dubbo](https://github.com/seata/seata-samples/tree/master/dubbo) - Integration example of [Seata](https://github.com/seata/seata) and [Apache Dubbo](https://github.com/apache/dubbo)
* [springboot](https://github.com/seata/seata-samples/tree/master/springboot) - Integration example of [Seata](https://github.com/seata/seata) and [Spring Boot](https://github.com/spring-projects/spring-boot/) 
* [nacos](https://github.com/seata/seata-samples/tree/master/nacos) - Integration example of [Seata](https://github.com/alibaba/fescar)、 [Apache Dubbo](https://github.com/apache/dubbo) and [Alibaba Nacos](https://github.com/alibaba/nacos/) 
* [springboot-dubbo-seata](https://github.com/seata/seata-samples/tree/master/springboot-dubbo-seata) - Integration example of [Seata](https://github.com/seata/seata)、 [Apache Dubbo](https://github.com/apache/dubbo) and [Spring Boot](https://github.com/spring-projects/spring-boot/) 
* [nutzboot-dubbo-seata](https://github.com/seata/seata-samples/tree/master/nutzboot-dubbo-fescar) - Integration example of [Seata](https://github.com/seata/seata)、 [Apache Dubbo](https://github.com/apache/dubbo) and [NutzBoot](https://github.com/nutzam/nutzboot/) 
* [springcloud-jpa-seata](https://github.com/seata/seata-samples/tree/master/springcloud-jpa-seata) - Integration example of [Seata](https://github.com/Seata) and [Spring Cloud](https://github.com/spring-cloud) and JPA
* [spring-boot-multiple-datasource](./multiple-datasource) - Integration example of [Seata](https://github.com/Seata) and [Spring Boot](https://github.com/spring-projects/spring-boot/) with multiple datasource and MyBatis
* [springboot-mybatis](https://github.com/seata/seata-samples/tree/master/springboot-mybatis) - Integration example of [Seata](https://github.com/Seata) and [Spring Boot](https://github.com/spring-projects/spring-boot/) and [Mybatis](https://github.com/mybatis/mybatis-3) 
* [api](https://github.com/seata/seata-samples/tree/master/api) - Non-Spring environment uses api to build Seata distributed transactions
* [spring-boot-multiple-datasource-mybatis-plus](./multiple-datasource-mybatis-plus) - Integration example of [Seata](https://github.com/Seata) and [Spring Boot](https://github.com/spring-projects/spring-boot/) with multiple datasource and [MyBatisPlus](https://github.com/baomidou/mybatis-plus)
* [springcloud-nacos-seata](https://github.com/seata/seata-samples/tree/master/springcloud-nacos-seata) - Integration 
example of [Seata](https://github.com/Seata) and [Spring Cloud](https://github.com/spring-cloud) and [Alibaba Nacos](https://github.com/alibaba/nacos/)
* [saga](https://github.com/seata/seata-samples/tree/master/saga) - Saga mode distributed transaction demo projects


## Guide 

- [Quick integration with Spring Cloud](./doc/quick-integration-with-spring-cloud.md)
