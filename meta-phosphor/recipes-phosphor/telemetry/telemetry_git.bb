SUMMARY = "Telemetry service"
DESCRIPTION = "Middleware between Redfish Telemetry Service and dbus-sensors"
HOMEPAGE = "https://github.com/openbmc/telemetry"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/openbmc/telemetry"

PV = "1.0+git${SRCPV}"
SRCREV = "7e098e93ef0974739459d296f99ddfab54722c23"

S = "${WORKDIR}/git"

inherit meson
inherit systemd

DEPENDS = "boost \
           gtest \
           nlohmann-json \
           phosphor-logging \
           sdbusplus \
           systemd"

SYSTEMD_SERVICE:${PN} = "xyz.openbmc_project.Telemetry.service"
EXTRA_OEMESON = "-Dbuildtest=false"

