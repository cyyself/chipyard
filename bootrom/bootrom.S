#define BOOTRAM_BASE 0x60000000

.section .text.start, "ax", @progbits
  nop

.section .text.hang, "ax", @progbits
.globl _hang
_hang: // reset vector
  li s0, BOOTRAM_BASE
  jr s0

.section .text.hang80, "ax", @progbits
  nop
