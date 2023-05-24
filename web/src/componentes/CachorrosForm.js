import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const CachorroForm = ({ initialValues, onSubmit }) => {
  const [nome, setName] = useState(initialValues.nome || '');
  const [raca, setRaca] = useState(initialValues.raca || '');
  const [sexo, setSexo] = useState(initialValues.sexo || '');
  const [cadastro, setCadastro] = useState(initialValues.cadastro || '');
  const [atualizacao, setAtualizacao] = useState(initialValues.atualizacao || '');

  const navigate = useNavigate();


  const handleSubmit = async (e) => {
    e.preventDefault();
    const Cachorro = { nome, raca, sexo, cadastro, atualizacao };
    try {
        await axios.post('http://localhost:8080/api/cachorrosCreate', Cachorro);
        navigate('/');
      } catch (error) {
        console.error('Error creating Cachorro:', error);
      }
  };

  return (
    <div>
      <h2>Formulário</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Nome:</label>
          <input
            type="text"
            value={nome}
            onChange={(e) => setName(e.target.value)}
          />
        </div>
        <div>
          <label>Raça:</label>
          <input
            type="text"
            value={raca}
            onChange={(e) => setRaca(e.target.value)}
          />
        </div>
        <div>
          <label>Sexo:</label>
          <input
            type="text"
            value={sexo}
            onChange={(e) => setSexo(e.target.value)}
          />
        </div>
        <div>
          <label>Data de cadastro:</label>
          <input
            type="text"
            value={cadastro}
            onChange={(e) => setCadastro(e.target.value)}
          />
        </div>
        <div>
          <label>Data de atualização:</label>
          <input
            type="text"
            value={atualizacao}
            onChange={(e) => setAtualizacao(e.target.value)}
          />
        </div>
        <button type="submit">Save</button>
      </form>
    </div>
  );
};

export default CachorroForm;
