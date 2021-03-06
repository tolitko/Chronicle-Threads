/*
 * Copyright 2015 Higher Frequency Trading
 *
 * http://www.higherfrequencytrading.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.chronicle.threads;

/**
 * Created by peter.lawrey on 11/12/14.
 */
public enum BusyPauser implements Pauser {
    INSTANCE;

    @Override
    public void reset() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void pause(long maxPauseNS) {
    }

    @Override
    public void unpause() {
    }
}
