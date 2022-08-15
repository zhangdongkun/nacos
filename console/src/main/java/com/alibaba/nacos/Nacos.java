/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 *
 * proto编译
 *
 * 当我们导入成功以后，会出现程序包com.alibaba.nacos.consistency.entity不存在的错误提示，这是因为Nacos底层的数据通信会基于protobuf对数据做序列化和反序列化，需要先将proto文件编译为对应的Java代码。
 *
 * 安装protocol buffer 插件 重新用manven 编译解决
 * Nacos缺少Istio依赖问题解决
 *
 * 我们只需要在文件根目录下执行以下命令即可：
 *
 * mvn clean package -Dmaven.test.skip=true -Dcheckstyle.skip=true
 *
 *
 * 启动时记得加参数
 * -Dnacos.standalone=true
 *
 */




/**
 * Nacos starter.
 *
 *
 * @author nacos
 */
@SpringBootApplication(scanBasePackages = "com.alibaba.nacos")
@ServletComponentScan
@EnableScheduling
public class Nacos {
    
    public static void main(String[] args) {
        SpringApplication.run(Nacos.class, args);
    }
}

