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

package com.alibaba.nacos.naming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Nacos naming starter.
 *
 * @author xxc
 */

/**
 * com.alibaba.nacos.naming.controllers.InstanceController#register(javax.servlet.http.HttpServletRequest)
 * com.alibaba.nacos.naming.consistency.ephemeral.distro.v2.DistroClientComponentRegistry#doRegister() --注册事件
 * //发现的日志参考 https://blog.csdn.net/htydowd/article/details/122084640
 *
 * todo
 * grpc 长连接的建立过程
 *
 */
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"com.alibaba.nacos.naming", "com.alibaba.nacos.core"})
public class NamingApp {
    
    public static void main(String[] args) {
        SpringApplication.run(NamingApp.class, args);
    }
}
