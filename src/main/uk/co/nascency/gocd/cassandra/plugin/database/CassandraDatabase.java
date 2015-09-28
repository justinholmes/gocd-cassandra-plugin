package main.uk.co.nascency.gocd.cassandra.plugin.database;

import com.thoughtworks.go.database.QueryExtensions;

import javax.sql.DataSource;
import java.io.File;
import java.sql.SQLException;

public class CassandraDatabase implements com.thoughtworks.go.database.Database {
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
