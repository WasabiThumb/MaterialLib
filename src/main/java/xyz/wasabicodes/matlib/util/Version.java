package xyz.wasabicodes.matlib.util;

import org.bukkit.Bukkit;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Version {

    private static final int minorVersion;
    private static final int patchVersion;
    static {
        // adopted from PaperLib
        Pattern versionPattern = Pattern.compile("(?i)\\(MC: (\\d)\\.(\\d+)\\.?(\\d+?)?(?: Pre-Release )?(\\d)?\\)");
        Matcher matcher = versionPattern.matcher(Bukkit.getVersion());
        int version = 0;
        int pVersion = 0;
        if (matcher.find()) {
            MatchResult matchResult = matcher.toMatchResult();
            try {
                version = Integer.parseInt(matchResult.group(2), 10);
            } catch (Exception ignored) {
            }
            if (matchResult.groupCount() >= 3) {
                try {
                    pVersion = Integer.parseInt(matchResult.group(3), 10);
                } catch (Exception ignored) {
                }
            }
        }
        minorVersion = version;
        patchVersion = pVersion;
    }

    public static int getVersion() {
        return minorVersion;
    }

    public static int getPatchVersion() {
        return patchVersion;
    }

    public static boolean isVersion(int version) {
        return minorVersion >= version;
    }

    public static boolean isVersion(int version, int patchVersion) {
        return ((minorVersion > version) || (minorVersion == version && Version.patchVersion >= patchVersion));
    }

}
