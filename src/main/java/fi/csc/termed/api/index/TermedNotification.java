package fi.csc.termed.api.index;

import fi.csc.termed.api.common.NodeIdentifier;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class TermedNotification {

    public static class Body {
        @NotNull public String user;
        @NotNull public Date date;
        @NotNull public List<NodeIdentifier> nodes;
        public boolean sync;
    }

    public enum EventType {
        NodeSavedEvent,
        NodeDeletedEvent,
        ApplicationReadyEvent,
        ApplicationShutdownEvent
    }

    @NotNull public EventType type;
    @NotNull public Body body;
}
