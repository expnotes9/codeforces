// node.js 9.4.0

function main() {
  const readline = require('readline');
  const rl = readline.createInterface({ input: process.stdin });
  const io = consoleIo();
  io.next();
  rl.on('line', (line) => io.next(line));
  rl.on('close', () => io.next());
}

function* consoleIo() {
  const n = parseInt(yield 0);
  const s = yield 0;
  const x = new Array(n);
  const y = new Array(n);
  for (let i = 0; i < n; i++)
    [x[i], y[i]] = (yield 0).split(' ').map(Number);

  // solve here

  console.log(n);
  console.log(s);
  console.log(x[0]);
  console.log(y[n - 1]);
}

function solve(n) {
  return 0;
}

main();
