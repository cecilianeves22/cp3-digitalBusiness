import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import CachorrosList from './componentes/CachorrosList';
import CachorrosEdit from './componentes/CachorrosEdit';
import CachorrosCreate from './componentes/CachorrosCreate';

import './App.css'

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<CachorrosList />} />
        <Route path="/create" element={<CachorrosCreate />} />
        <Route path="/edit/:id" element={<CachorrosEdit />} />
      </Routes>
    </Router>
  );
}

export default App;
