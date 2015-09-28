package main.uk.co.nascency.gocd.cassandra.plugin.database;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ProtocolOptions;
import com.datastax.driver.core.policies.DCAwareRoundRobinPolicy;
import com.datastax.driver.core.policies.LatencyAwarePolicy;
import com.thoughtworks.go.database.QueryExtensions;

import javax.sql.DataSource;
import java.io.File;
import java.sql.SQLException;

public class CassandraDatabase implements com.thoughtworks.go.database.Database {

    private static final Cluster cluster = cassandraConnectionFactory();

    public static Cluster getCluster() {
        return cluster;
    }

    private static Cluster cassandraConnectionFactory() {
        return Cluster.builder()
                .addContactPoints("localhost")
                .withCompression(ProtocolOptions.Compression.LZ4).build();
    }

    @Override
    public String dialectForHibernate() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void startDatabase() {

    }

    @Override
    public DataSource createDataSource() {
        return null;
    }

    @Override
    public void upgrade() throws SQLException {

    }

    @Override
    public void shutdown() throws SQLException {

    }

    @Override
    public void backup(File file) {

    }

    @Override
    public String getIbatisConfigXmlLocation() {
        return null;
    }

    @Override
    public QueryExtensions getQueryExtensions() {
        return null;
    }
}
