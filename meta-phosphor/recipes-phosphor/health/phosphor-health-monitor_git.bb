SUMMARY = "BMC Health Monitoring"
DESCRIPTION = "Daemon to collect and monitor bmc health statistics"
HOMEPAGE = "https://github.com/openbmc/phosphor-health-monitor"
PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9e69ba356fa59848ffd865152a3ccc13"

inherit meson pkgconfig
inherit systemd

DEPENDS += "sdbusplus"
DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "sdeventplus"
DEPENDS += "phosphor-logging"
DEPENDS += "nlohmann-json"

SRC_URI = "git://github.com/openbmc/phosphor-health-monitor.git;protocol=git"
SRCREV = "036f1617ec021fc67c57069b5ed8f02f5b356f80"
S = "${WORKDIR}/git"

SYSTEMD_SERVICE:${PN} = "phosphor-health-monitor.service"
