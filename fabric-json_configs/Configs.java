
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

/**
 * A utility class for initializing and storing configuration keys.
 * Contains static configuration entries that are registered with the ModConfigManager.
 */
public class Configs {

    /**
     * Initializes any necessary configurations.
     * Currently, this method is a placeholder for future initialization logic.
     */
    public static void initConfigs() {}

    // Example configuration entries registered with ModConfigManager.
    // These entries are stored as static final Strings representing their keys.

    // An example configuration entry for an integer value.
    public static final String exampleInteger = ModConfigManager.register("example_integer", 5, "The drop rate of Cherries, as a percentage.").getKey();

    // An example configuration entry for a boolean value.
    public static final String exampleBoolean = ModConfigManager.register("example_boolean", true, "Will the weapon set you on fire?").getKey();

    // An example configuration entry for a float value.
    public static final String exampleFloat = ModConfigManager.register("example_float", 0.5f, "The amount of time between fire damaging you.").getKey();

    // An example configuration entry for a string value.
    public static final String exampleString = ModConfigManager.register("example_string", "This is an example String!", "Example String").getKey();

    // An example configuration entry for a double value.
    public static final String exampleDouble = ModConfigManager.register("example_double", 0.75D, "Example Double").getKey();

}
