package com.electro2560.dev.cluescrolls.events;

import java.util.UUID;
import org.bukkit.event.Event;

/**
 * A scroll event
 *
 * @since 4.8.6
 * @version 4.8.6
 */
public abstract class ScrollEvent extends Event {

  private final String tierType;
  private final UUID scrollUUID;

  public ScrollEvent(final String tierType, final UUID scrollUUID) {
    this.tierType = tierType;
    this.scrollUUID = scrollUUID;
  }

  /**
   * Returns the tier type as a string of the completed scroll
   * @return Tier type
   * @since 4.8.6
   */
  public final String getTierType() {
    return tierType;
  }

  /**
   * Get the UUID of the generated scroll
   * @return Scroll UUID
   * @since 4.8.6
   */
  public final UUID getScrollUUID() {
    return scrollUUID;
  }

}
