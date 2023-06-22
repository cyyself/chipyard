package chipyard

import org.chipsalliance.cde.config.{Config}

// ---------------------
// BOOM Configs
// ---------------------

class SmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(1) ++                          // small boom config
  new chipyard.config.AbstractConfig)

class MediumBoomConfig extends Config(
  new boom.common.WithNMediumBooms(1) ++                         // medium boom config
  new chipyard.config.AbstractConfig)

class LargeBoomConfig extends Config(
  new boom.common.WithNLargeBooms(1) ++                          // large boom config
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class MegaBoomConfig extends Config(
  new boom.common.WithNMegaBooms(1) ++                           // mega boom config
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class DualSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(2) ++                          // 2 boom cores
  new chipyard.config.AbstractConfig)

class Cloned64MegaBoomConfig extends Config(
  new boom.common.WithCloneBoomTiles(63, 0) ++
  new boom.common.WithNMegaBooms(1) ++                           // mega boom config
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class LoopbackNICLargeBoomConfig extends Config(
  new chipyard.harness.WithLoopbackNIC ++                        // drive NIC IOs with loopback
  new icenet.WithIceNIC ++                                       // build a NIC
  new boom.common.WithNLargeBooms(1) ++
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class DromajoBoomConfig extends Config(
  new chipyard.harness.WithSimDromajoBridge ++                   // attach Dromajo
  new chipyard.config.WithTraceIO ++                             // enable the traceio
  new boom.common.WithNSmallBooms(1) ++
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class MediumBoomCosimConfig extends Config(
  new chipyard.harness.WithCospike ++                            // attach spike-cosim
  new chipyard.config.WithTraceIO ++                             // enable the traceio
  new boom.common.WithNMediumBooms(1) ++
  new chipyard.config.AbstractConfig)

class dmiMediumBoomConfig extends Config(
  new chipyard.harness.WithSerialTLTiedOff ++                    // don't attach anything to serial-tl
  new chipyard.config.WithDMIDTM ++                              // have debug module expose a clocked DMI port
  new boom.common.WithNMediumBooms(1) ++
  new chipyard.config.AbstractConfig)

class dmiMediumBoomCosimConfig extends Config(
  new chipyard.harness.WithCospike ++                            // attach spike-cosim
  new chipyard.config.WithTraceIO ++                             // enable the traceio
  new chipyard.harness.WithSerialTLTiedOff ++                    // don't attach anythint to serial-tl
  new chipyard.config.WithDMIDTM ++                              // have debug module expose a clocked DMI port
  new boom.common.WithNMediumBooms(1) ++
  new chipyard.config.AbstractConfig)

class MyBoomConfig extends Config(
  new boom.common.WithNSmallBooms(2) ++

  new chipyard.harness.WithBlackBoxSimMem ++
  new chipyard.harness.WithSimAXIMMIO ++
  new chipyard.harness.WithTieOffInterrupts ++
  new chipyard.harness.WithTieOffL2FBusAXI ++
  new chipyard.harness.WithClockAndResetFromHarness ++

  new chipyard.iobinders.WithAXI4MemPunchthrough ++
  new chipyard.iobinders.WithAXI4MMIOPunchthrough ++
  new chipyard.iobinders.WithL2FBusAXI4Punchthrough ++
  new chipyard.iobinders.WithExtInterruptIOCells ++
  new chipyard.iobinders.WithDividerOnlyClockGenerator ++

  new chipyard.config.WithNoSubsystemDrivenClocks ++
  new chipyard.config.WithInheritBusFrequencyAssignments ++
  new chipyard.config.WithPeripheryBusFrequencyAsDefault ++
  new chipyard.config.WithMemoryBusFrequency(75) ++
  new chipyard.config.WithPeripheryBusFrequency(75) ++
  new freechips.rocketchip.subsystem.WithTimebase(75000000) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(4) ++
  new freechips.rocketchip.subsystem.WithDontDriveBusClocksFromSBus ++
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
  new freechips.rocketchip.subsystem.WithExtMemSize(0x80000000L) ++
  new freechips.rocketchip.subsystem.WithBootROMFile("bootrom/bootrom.rv64.img") ++
  new freechips.rocketchip.system.BaseConfig)

class MyBoomConfig2 extends Config(
  new boom.common.WithNMediumBooms(2) ++

  new chipyard.harness.WithBlackBoxSimMem ++
  new chipyard.harness.WithSimAXIMMIO ++
  new chipyard.harness.WithTieOffInterrupts ++
  new chipyard.harness.WithTieOffL2FBusAXI ++
  new chipyard.harness.WithClockAndResetFromHarness ++

  new chipyard.iobinders.WithAXI4MemPunchthrough ++
  new chipyard.iobinders.WithAXI4MMIOPunchthrough ++
  new chipyard.iobinders.WithL2FBusAXI4Punchthrough ++
  new chipyard.iobinders.WithExtInterruptIOCells ++
  new chipyard.iobinders.WithDividerOnlyClockGenerator ++

  new chipyard.config.WithNoSubsystemDrivenClocks ++
  new chipyard.config.WithInheritBusFrequencyAssignments ++
  new chipyard.config.WithPeripheryBusFrequencyAsDefault ++
  new chipyard.config.WithMemoryBusFrequency(100) ++
  new chipyard.config.WithPeripheryBusFrequency(100) ++
  new freechips.rocketchip.subsystem.WithTimebase(100000000) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(4) ++
  new freechips.rocketchip.subsystem.WithDontDriveBusClocksFromSBus ++
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
  new freechips.rocketchip.subsystem.WithExtMemSize(0x80000000L) ++
  new freechips.rocketchip.subsystem.WithBootROMFile("bootrom/bootrom.rv64.img") ++
  new freechips.rocketchip.system.BaseConfig)
