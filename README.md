# Fabric-Json Configs Overview 
This project includes a flexible and robust configuration system designed to manage mod settings within a Minecraft mod using the Fabric API. The configuration system allows you to define and manage mod-specific settings in a structured and maintainable way.

## Key Classes 

**ModConfigManager**
  
  - **Purpose:** Centralized manager for handling all configuration entries. It is responsible for loading, saving, and resetting configurations, as well as providing methods to register and retrieve configuration values.
  - **Features:**
    - **Registration:** Allows mod developers to register new configuration entries with a unique key, a default value, and an optional comment.
    - **Persistence:** Configuration entries are saved to a JSON file, which is automatically loaded on startup and can be modified by the user.
    - **Reset Functionality:** Allows resetting configurations to their default values, which is useful for debugging or troubleshooting.

**ModConfigEntry<T>**

  - **Purpose:** Represents an individual configuration entry. Each entry is typed (e.g., Integer, Boolean, Float) and includes a key, a value, a default value, and an optional comment.
  - **Features:**
    - **Type Safety:** Ensures that each configuration entry is handled with the correct data type.
    - **Comments:** Provides context for each configuration setting, which is especially useful when the configuration file is reviewed or edited manually.
    - **Default Values:** Stores the default value for easy reset and fallback mechanisms.

**Configs**

  - **Purpose:** A utility class that initializes and stores the keys for the configuration entries. It serves as a centralized location for all configuration keys used within the mod.
