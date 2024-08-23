
/*
 * Copyright (c) 2024 EmilSG
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import net.emilsg.config.modconfig.Configs;
import net.emilsg.config.modconfig.ModConfigManager;
import net.fabricmc.api.ModInitializer;

public class ModInitialize implements ModInitializer {

    //This is only here to represent how you could access these values.
    //Make sure to initialize the configs first, that way you should not have to deal with null values.

    @Override
    public void onInitialize() {
        ModConfigManager.loadConfig();

        int exampleInteger = ModConfigManager.get(Configs.exampleInteger, 5);
        boolean exampleBoolean = ModConfigManager.get(Configs.exampleBoolean, true);
        float exampleFloat = ModConfigManager.get(Configs.exampleFloat, 0.5f);
        String exampleString = ModConfigManager.get(Configs.exampleString, "This is an example String!")
        double = ModConfigManager.get(Configs.exampleDouble, 0.75D)

    }

}
