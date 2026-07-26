# Minecraft Client Mod

🎮 A powerful Minecraft 1.20.1 Fabric mod with advanced client features, HUD enhancements, and performance optimizations.

## ✨ Features

- 🎯 **Advanced HUD System** - Customizable heads-up display with coordinates, FPS counter, and more
- ⚡ **Performance Enhancements** - Render distance optimization and chunk loading improvements
- 🎮 **Custom Key Bindings** - Easy-to-configure keybinds for mod features
- 🛠️ **Extensible Architecture** - Well-structured codebase for easy feature additions
- 📊 **Event System** - Comprehensive event callbacks for custom logic
- 🎨 **Custom Content Support** - Framework for custom items, blocks, and textures

## 📋 Requirements

- **Minecraft 1.20.1**
- **Fabric Loader 0.15.9+**
- **Java 17 or higher**
- **Fabric API 0.92.4+**

## 🚀 Installation

### 1. Download Fabric Installer
Download from [fabricmc.net](https://fabricmc.net/use/)

### 2. Install Fabric for Minecraft 1.20.1
```bash
java -jar fabric-installer.jar client
```

### 3. Build the mod
```bash
./gradlew build
```

The mod JAR will be created at:
```
build/libs/minecraft-client-mod-1.0.0.jar
```

### 4. Install the mod
1. Navigate to your Minecraft folder
2. Go to `mods` directory (create if it doesn't exist)
3. Copy the mod JAR to the `mods` folder
4. Launch Minecraft with the Fabric profile

## 🎮 Usage

### Key Bindings
- **V** - Toggle HUD visibility
- **U** - Open mod settings

### In-Game Commands
```
/mcclient status          - Show mod status
/mcclient config          - Open configuration
/mcclient help            - Show help message
```

## 🏗️ Project Structure

```
minecraft-client/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/skyeguyy9/minecraft/client/
│       │       ├── MinecraftClientMod.java           # Main mod class
│       │       ├── MinecraftClientModClient.java     # Client initializer
│       │       ├── ModFeatures.java                  # Feature registry
│       │       ├── ModCommands.java                  # Command handling
│       │       ├── ClientEventHandler.java           # Event listeners
│       │       ├── ClientCommands.java               # Client commands
│       │       ├── KeyBindings.java                  # Key binding registry
│       │       └── mixin/
│       │           └── MixinHudRendering.java        # Rendering mixins
│       └── resources/
│           ├── fabric.mod.json                       # Mod metadata
│           ├── minecraft_client_mod.mixins.json      # Mixin configuration
│           └── assets/
│               └── minecraft_client_mod/
│                   └── lang/
│                       └── en_us.json                 # Language file
├── build.gradle                                       # Gradle build config
├── gradle.properties                                  # Gradle properties
├── settings.gradle                                    # Gradle settings
└── README.md
```

## 🔧 Development

### Building for development
```bash
./gradlew build
```

### Running in IDE
1. Import project as Gradle project
2. Run `generateSources` task
3. Run the `runClient` configuration

### Building for distribution
```bash
./gradlew clean build
```

### Publishing to local Maven
```bash
./gradlew publish
```

## 🔨 Build Environment Setup

### Windows
```bash
gradlew.bat build
```

### Linux/macOS
```bash
./gradlew build
```

## 📦 Dependencies

| Dependency | Version | Purpose |
|-----------|---------|----------|
| Fabric API | 0.92.4+1.20.1 | Core Fabric API |
| Fabric Loader | 0.15.9 | Mod loader |
| Minecraft | 1.20.1 | Game files |

## 🐛 Troubleshooting

### Build fails with "Unsupported class version"
- Ensure Java 17+ is installed and set as JAVA_HOME
- Check `build.gradle` for correct Java version

### Mod doesn't load in-game
1. Verify mod is in correct mods folder
2. Check that Fabric Loader is installed
3. Review latest.log for error messages
4. Ensure Fabric API is installed

### Events not firing
- Verify event registration in `ClientEventHandler.java`
- Check that methods have correct `@Inject` annotations
- Review mixin configuration in `minecraft_client_mod.mixins.json`

## 📝 Adding New Features

1. **Create a new feature class** in `src/main/java/com/skyeguyy9/minecraft/client/`
2. **Register in ModFeatures.java** or appropriate event handler
3. **Add language strings** to `en_us.json`
4. **Test thoroughly** before committing
5. **Rebuild**: `./gradlew build`

## 📄 License

MIT License - See LICENSE file for details

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## 💬 Support

For issues, feature requests, or questions, please open an [issue](https://github.com/skyeguyy9-dev/minecraft-client/issues) on GitHub.

---

**Happy modding!** 🚀
