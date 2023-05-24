import React from 'react';
import axios from 'axios';
import CachorroForm from './CachorrosForm';

const CachorroCreate = ({ navigate }) => {
  const createCachorro = async (Cachorro) => {
    try {
      await axios.post('http://localhost:8080/api/cachorrosCreate', Cachorro);
      navigate('/');
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div>
      <h1>Criar Cachorro Adoção</h1>
      <CachorroForm initialValues={{}} onSubmit={createCachorro} />
    </div>
  );
};

export default CachorroCreate;
