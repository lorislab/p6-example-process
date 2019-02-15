/*
 * Copyright 2019 lorislab.org.
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
package org.lorislab.p6.example.process;


import lombok.extern.slf4j.Slf4j;
import org.lorislab.p6.annotations.ServiceTask;
import org.lorislab.p6.annotations.WorkflowProcess;
import org.lorislab.p6.client.service.ServiceTaskItem;

import javax.xml.namespace.QName;

@Slf4j
@WorkflowProcess(processId = "org.lorislab.p6.example.Test1", processVersion = "1.0.0")
public class Test1 {

    @ServiceTask(value = "service1")
    public void service1(ServiceTaskItem item) {
        log.info("Execute service1!");
    }

    @ServiceTask(value = "service2")
    public void service2(ServiceTaskItem item) {
        log.info("Execute service2!");
    }

    @ServiceTask(value = "service3")
    public void service3(ServiceTaskItem item) {
        log.info("Execute service3!");
    }

    @ServiceTask(value = "service4")
    public void service4(ServiceTaskItem item) {
        log.info("Execute service4!");
    }
}
