FROM lorislab/p6

# Deploy the application
ADD target/*.war /opt/jboss/wildfly/standalone/deployments/
