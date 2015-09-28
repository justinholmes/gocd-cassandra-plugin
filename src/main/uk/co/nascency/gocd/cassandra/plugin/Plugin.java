package main.uk.co.nascency.gocd.cassandra.plugin;

import com.thoughtworks.go.plugin.api.GoApplicationAccessor;
import com.thoughtworks.go.plugin.api.GoPlugin;
import com.thoughtworks.go.plugin.api.GoPluginIdentifier;
import com.thoughtworks.go.plugin.api.exceptions.UnhandledRequestTypeException;
import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;
import main.uk.co.nascency.gocd.cassandra.plugin.database.CassandraDatabase;

import static java.util.Arrays.asList;

import java.util.List;

public class Plugin implements GoPlugin {
    public static final String EXTENSION_NAME = "cassandra";
    private static final List<String> goSupportedVersions = asList("1.0");


    @Override
    public void initializeGoApplicationAccessor(GoApplicationAccessor goApplicationAccessor) {
        System.setProperty("go.database.provider", "main.uk.co.nascency.gocd.cassandra.plugin.database.CassandraDatabase");
    }

    @Override
    public GoPluginApiResponse handle(GoPluginApiRequest goPluginApiRequest) throws UnhandledRequestTypeException {
        return null;
    }

    @Override
    public GoPluginIdentifier pluginIdentifier() {
        return new GoPluginIdentifier(EXTENSION_NAME, goSupportedVersions)
    }
}
