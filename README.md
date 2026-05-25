# Animatica Continuation

Animatica Continuation is an unofficial community continuation of Animatica for Fabric. It keeps support available for resource packs that use the MCPatcher/OptiFine [custom animated texture format](https://github.com/sp614x/optifine/blob/master/OptiFineDoc/doc/custom_animations.txt) without requiring OptiFine.

This fork currently targets Minecraft `1.20.1` on Fabric.

## What It Supports

Animatica adds support for custom animated textures in resource packs, including:

- animated GUI textures
- animated entity textures
- animated block entity textures
- animated armor textures
- other MCPatcher/OptiFine animated textures

Animated blocks and animated items are already supported by vanilla Minecraft and do not need Animatica.

## What It Does Not Support

Animatica is only for animated textures. It does not add support for:

- fully custom GUIs
- custom entity models
- custom entity model part animations
- connected textures
- other unrelated MCPatcher or OptiFine resource pack features

Use a dedicated mod for those features, such as OptiGUI, CEM, or a connected textures mod.

## Installation

1. Install Fabric Loader for the supported Minecraft version.
2. Install Fabric API if your modpack already requires it.
3. Put the Animatica Continuation jar in your `mods` folder.
4. Put compatible resource packs in your `resourcepacks` folder.
5. Enable the resource pack in-game.

## Downloads

Use the approved Modrinth or CurseForge project page when available. Development builds may also be published on the GitHub releases page for this repository.

## Reporting Issues

Open issues on this continuation repository when a supported animated texture pack fails to load, renders incorrectly, or causes a crash.

Include:

- Minecraft version
- Fabric Loader version
- Animatica Continuation version
- the affected resource pack
- `latest.log` or the crash report

## Building

```bash
./gradlew build
```

Built jars are written to `build/libs`.

## Credits

Animatica was originally created by FoundationGames. This continuation keeps the project available for newer environments while preserving the original scope of the mod.
