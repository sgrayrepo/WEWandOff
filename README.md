## Summary

WEWandOff is a small extension to WorldEdit that defaults the edit wand to "off" on player login.

## Explanation

WorldEdit is a very popular world manipulation plugin for Bukkit servers. By default, if someone has permission to use the selection wand, then it is enabled at login and prevents normal game usage of the wand item. Such as, the default wand of a wooden axe cannot be used as an axe while WorldEdit has it enabled as a selection wand.

WEWandOff reverses this behavior so when player with permission logs in, the wand functionality disabled by default. Then if the player wishes to use the tool's wand properties, they can be enabled with /toggleeditwand

## Source Compilation

1. Copy the source by cloning the project.
2. Import into your preferred Java IDE (personal preference is Eclipse).
3. Enable Maven nature if it isn't automatically detected.
4. Compile using `clean install`.

## Server Install

Compiled builds can be found at
[https://sgray.ci.cloudbees.com/job/WEWandOff/](https://sgray.ci.cloudbees.com/job/WEWandOff/)

1. Place compiled jar into your server's plugin directory and (re-)start your server.
2. (optional) Give permissions to players/groups alert message and override, as you prefer.

## Permissions

`wandoff.override`
Restores normal default for wand state.

`wandoff.showalert`
Player will be shown a message at login informing them that the wand is disabled and how to enable.

## Credit

Thanks goes to sk89q for making the incredibly useful WorldEdit plugin.

## License

This project uses the [GNU Lesser General Public License v3](https://www.gnu.org/licenses/lgpl.html)