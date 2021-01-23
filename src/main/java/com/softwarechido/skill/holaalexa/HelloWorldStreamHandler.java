/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.softwarechido.skill.holaalexa;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.softwarechido.skill.holaalexa.handlers.CancelandStopIntentHandler;
import com.softwarechido.skill.holaalexa.handlers.FallbackIntentHandler;
import com.softwarechido.skill.holaalexa.handlers.HelloWorldIntentHandler;
import com.softwarechido.skill.holaalexa.handlers.HelpIntentHandler;
import com.softwarechido.skill.holaalexa.handlers.LaunchRequestHandler;
import com.softwarechido.skill.holaalexa.handlers.SessionEndedRequestHandler;
import com.amazon.ask.SkillStreamHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

    @SuppressWarnings("unchecked")
	private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                // Add your skill id below
                //.withSkillId("")
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}
