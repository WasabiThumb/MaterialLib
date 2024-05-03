/**
 * Based on the trend of stability in the Material API starting in MC 1.14, this system was introduced to
 * reduce code size by only handing inexact conversion of missing Materials. A {@link xyz.wasabicodes.matlib.struct.map.impl.MaterialMapImpl MaterialMapImpl}
 * will be picked based on the MC Server version (MC 1.8 - MC 1.14) and then proxies will be added for each version
 * between MC 1.15 and (latest) that is greater than the current version.
 */
package xyz.wasabicodes.matlib.struct.map.proxy;