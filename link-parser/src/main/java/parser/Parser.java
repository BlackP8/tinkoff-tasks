package parser;

import java.net.URI;

public sealed interface Parser permits LinkParser {
    Object resolve(URI link);
}
