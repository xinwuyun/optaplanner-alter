/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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

package org.optaplanner.examples.cheaptime.app;

import org.optaplanner.examples.cheaptime.domain.CheapTimeSolution;
import org.optaplanner.examples.cheaptime.optional.score.CheapTimeEasyScoreCalculator;
import org.optaplanner.examples.common.app.CommonApp;
import org.optaplanner.examples.common.app.UnsolvedDirSolveAllTurtleTest;

public class CheapTimeSolveAllTurtleTest extends UnsolvedDirSolveAllTurtleTest<CheapTimeSolution> {

    @Override
    protected CommonApp<CheapTimeSolution> createCommonApp() {
        return new CheapTimeApp();
    }

    @Override
    protected Class<CheapTimeEasyScoreCalculator> overwritingEasyScoreCalculatorClass() {
        return CheapTimeEasyScoreCalculator.class;
    }
}
