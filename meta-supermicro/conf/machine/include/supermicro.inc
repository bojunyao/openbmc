MACHINE_FEATURES += "\
        obmc-bmc-state-mgmt \
        obmc-chassis-state-mgmt \
        obmc-host-state-mgmt \
        obmc-host-ipmi \
        obmc-host-ctl \
        obmc-phosphor-chassis-mgmt \
        obmc-phosphor-fan-mgmt \
        obmc-phosphor-flash-mgmt \
        "

VIRTUAL-RUNTIME_skeleton_workbook = "${MACHINE}-config"

PREFERRED_PROVIDER_virtual/obmc-chassis-mgmt = "packagegroup-supermicro-apps"
PREFERRED_PROVIDER_virtual/obmc-fan-mgmt = "packagegroup-supermicro-apps"
PREFERRED_PROVIDER_virtual/obmc-flash-mgmt = "packagegroup-supermicro-apps"
PREFERRED_PROVIDER_virtual/obmc-host-ctl ?= "obmc-op-control-host"
PREFERRED_PROVIDER_virtual/obmc-inventory-data ?= "${VIRTUAL-RUNTIME_skeleton_workbook}"
PREFERRED_PROVIDER_virtual/obmc-host-ipmi-hw ?= "phosphor-ipmi-kcs"

OVERRIDES .= ":supermicro"
