FROM airhacks/glassfish
COPY ./target/kata-7.war ${DEPLOYMENT_DIR}
